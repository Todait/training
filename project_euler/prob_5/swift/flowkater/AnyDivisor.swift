//
//  AnyDivisorTests.swift
//  Euler
//
//  Created by flowkater on 2014. 11. 26..
//  Copyright (c) 2014년 gplelab. All rights reserved.
//

// 1 ~ 10 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다.
// 그러면 1 ~ 20 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까?

import Quick
import Nimble
import Darwin

class AnyDivisor{
    
    func continuousNumbersLCM(max: Int) -> Int{
        var arr:[Int] = []
        var divisors = [Int]()
        var result = 1
        
        // arr 초기화
        for(var i = 1; i <= max ; i++){
            arr.append(i)
        }
        
        for(var i = 0; i < max ; i++){
            var divisor = 1
            for(var j = 0; j < max; j++){
                // 이거 못찾아서 2시간 삽질
                if i == j {
                    divisor = arr[i]
                }
                
                if arr[j] % divisor == 0{
                    arr[j] = arr[j] / divisor
                }
            }
            divisors.append(divisor)
        }
        
        // 곱
        for d in divisors {
            result *= d
        }
        
        return result
    }
}

class AnyDivisorTests: QuickSpec{
    override func spec() {
        var any: AnyDivisor?
        
        beforeEach{
            any = AnyDivisor()
        }
        
        describe("any divisor test"){
            
            it("lcm"){
                expect(any!.continuousNumbersLCM(10)).to(equal(2520))
                expect(any!.continuousNumbersLCM(20)).to(equal(232792560))
            }
        }
    }
}
