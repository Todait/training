//
//  EulerTests.swift
//  EulerTests
//
//  Created by flowkater on 2014. 11. 14..
//  Copyright (c) 2014년 gplelab. All rights reserved.
//
// 피보나치 수열의 각 항은 바로 앞의 항 두 개를 더한 것이 됩니다. 1과 2로 시작하는 경우 이 수열은 아래와 같습니다.
// 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
// 짝수이면서 4백만 이하인 모든 항을 더하면 얼마가 됩니까?

// 31 분

import Quick
import Nimble

class Pibonacci {
    func pibonacciNumber(n: Int) -> Int{
        if n == 1 {
            return 1
        }
        if n == 2 {
            return 2
        }
        return pibonacciNumber(n - 1) + pibonacciNumber(n - 2)
    }
    
 
    
    func getEvenPiboNumbersLessThan(n: Int) -> [Int] {
        var result = [Int]()
        var i = 1
        
        while true {
            let p = pibonacciNumber(i)
            
            if p > n {
                return result
            }
            
            if p % 2 == 0 {
                result.append(p)
            }
            
            i++
        }
    }
    
    func sumEvenPiboNumbers(n: Int) -> (() -> Int) {
        var result = 0
        func sum() -> Int{
            for i in getEvenPiboNumbersLessThan(n){
                result += i
            }
            return result
        }
        return sum
    }
    
}

class PibonacciSpec: QuickSpec {
    override func spec(){
        describe("Pibonacci"){
            var pibo: Pibonacci?
            
            beforeEach{
                pibo = Pibonacci()
            }
            
            describe("n number pibonacci"){
                it("pibonacciNumber"){
                    expect(pibo!.pibonacciNumber(1)).to(equal(1))
                    expect(pibo!.pibonacciNumber(2)).to(equal(2))
                    expect(pibo!.pibonacciNumber(3)).to(equal(3))
                    expect(pibo!.pibonacciNumber(4)).to(equal(5))
                    expect(pibo!.pibonacciNumber(5)).to(equal(8))
                }
   
                
                it("sumPiboNumbers"){
                    expect(pibo!.sumEvenPiboNumbers(3)).to(equal(2))
                    expect(pibo!.sumEvenPiboNumbers(5)).to(equal(2))
                    expect(pibo!.sumEvenPiboNumbers(20)).to(equal(10))
                    expect(pibo!.sumEvenPiboNumbers(4000000)).to(equal(4613732))
                }
                
                it("less than Number"){
                    expect(pibo!.getEvenPiboNumbersLessThan(10)).to(contain(2,8))
                    expect(pibo!.getEvenPiboNumbersLessThan(20)).to(contain(2,8))
                    expect(pibo!.getEvenPiboNumbersLessThan(90)).to(contain(2, 8, 34))
                }
            }
        }
    }
}
