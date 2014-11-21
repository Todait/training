//
//  PrimeFactorTests.swift
//  Euler
//
//  Created by flowkater on 2014. 11. 21..
//  Copyright (c) 2014년 gplelab. All rights reserved.
//
//  어떤 수를 소수의 곱으로만 나타내는 것을 소인수분해라 하고, 이 소수들을 그 수의 소인수라고 합니다.
//  예를 들면 13195의 소인수는 5, 7, 13, 29 입니다.
//  600851475143의 소인수 중에서 가장 큰 수를 구하세요.
//

import Quick
import Nimble
import Darwin

class PrimeFactor {
    func arrayMax(arr: [Int]) -> Int {
        return arr.reduce(Int.min, { max($0, $1)})
    }
    
    func primeFactorMax(n: Int) -> Int {
        return arrayMax(primeNumber(n))
    }
    
    /*
    소수는 모두 2를 제외하고 모두 홀수라서 2를 먼저 체크하고 3부터 홀수로 전부 체크하는 방법
    */
    func primeNumber(n: Int) -> [Int] {
        var result = [Int]()
        var divisor = n
        
        if divisor % 2 == 0 {
            result.append(2)
            divisor = divisor / 2
            
            while divisor % 2 == 0 {
                divisor = divisor / 2
            }
        }
        
        for(var i = 3; i <= divisor; i += 2 ){
            if divisor % i == 0 {
                divisor = divisor / i
                result.append(i)
                while divisor % i == 0 {
                    divisor = divisor / i
                }
            }
        }
        return result
    }
}


class PrimeFactorTests: QuickSpec{
    override func spec(){
        var prime: PrimeFactor?
        
        beforeEach{
            prime = PrimeFactor()
        }
        
        describe("prime factor method"){
            it("primeNumber"){
                expect(prime!.primeNumber(13)).to(contain(13))
                
                expect(prime!.primeNumber(10)).to(contain(2,5))
                expect(prime!.primeNumber(10).count).to(equal(2))
                
                expect(prime!.primeNumber(20)).to(contain(2,5))
                expect(prime!.primeNumber(20).count).to(equal(2))
                expect(prime!.primeNumber(40).count).to(equal(2))
                
                expect(prime!.primeNumber(13195)).to(contain(5,7,13,29))
                expect(prime!.primeNumber(13195).count).to(equal(4))
                
                expect(prime!.primeNumber(600851475143)).to(contain(71,839,1471,6857))
                expect(prime!.primeNumber(600851475143).count).to(equal(4))
            }
            
            it("arrayMax"){
                expect(prime!.arrayMax([1,2,3])).to(equal(3))
                expect(prime!.arrayMax([1,2,3,10])).to(equal(10))
            }
            
            it("primeFactorMax"){
                expect(prime!.primeFactorMax(13195)).to(equal(29))
                expect(prime!.primeFactorMax(600851475143)).to(equal(6857))
            }
        }
    }
}
