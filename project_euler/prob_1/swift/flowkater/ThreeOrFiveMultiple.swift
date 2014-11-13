//
//  project_eulerTests.swift
//  project_eulerTests
//
//  Created by flowkater on 2014. 11. 13..
//  Copyright (c) 2014년 gplelab. All rights reserved.
//
//
//10보다 작은 자연수 중에서 3 또는 5의 배수는 3, 5, 6, 9 이고, 이것을 모두 더하면 23입니다.
//1000보다 작은 자연수 중에서 3 또는 5의 배수를 모두 더하면 얼마일까요?

import Quick
import Nimble

class ThreeOrFiveMultiple{
    func isThreeOrFive(n: Int) -> Bool{
        if n % 3 == 0 || n % 5 == 0 {
            return true
        }else{
            return false
        }
    }
    
    func sumThreeOrFiveMultipe(n: Int) -> Int{
        var sum = 0
        for i in 1..<n {
            if isThreeOrFive(i) {
                sum += i
            }
        }
        return sum
    }
}

class ThreeOrFiveMultipleSpec: QuickSpec {
    override func spec(){
        describe("a threeorfivemultiple"){
            var multiple: ThreeOrFiveMultiple?
            
            beforeEach{
                multiple = ThreeOrFiveMultiple()
            }
        
            describe("isMultiple test"){
                it("is three or five multiple"){
                    expect(multiple!.isThreeOrFive(3)).to(beTruthy())
                    expect(multiple!.isThreeOrFive(4)).to(beFalsy())
                    expect(multiple!.isThreeOrFive(5)).to(beTruthy())
                    expect(multiple!.isThreeOrFive(6)).to(beTruthy())
                    expect(multiple!.isThreeOrFive(9)).to(beTruthy())
                    expect(multiple!.isThreeOrFive(7)).to(beFalsy())
                }
            }
            
            describe("range sum of all number"){
                it("less than 10"){
                    expect(multiple!.sumThreeOrFiveMultipe(10)).to(equal(23))
                }
                
                it("less than 1000"){
                    expect(multiple!.sumThreeOrFiveMultipe(1000)).to(equal(233168))
                }
            }
        }
    }
}
