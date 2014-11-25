//
//  PalindromeTests.swift
//  Euler
//
//  Created by flowkater on 2014. 11. 25..
//  Copyright (c) 2014년 gplelab. All rights reserved.
//

//앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 부릅니다.
//두 자리 수를 곱해 만들 수 있는 대칭수 중 가장 큰 수는 9009 (= 91 × 99) 입니다.
//세 자리 수를 곱해 만들 수 있는 가장 큰 대칭수는 얼마입니까?

import Quick
import Nimble

extension String
{
    subscript(integerIndex: Int) -> Character
        {
            let index = advance(startIndex, integerIndex)
            return self[index]
    }
    
    subscript(integerRange: Range<Int>) -> String
        {
            let start = advance(startIndex, integerRange.startIndex)
            let end = advance(startIndex, integerRange.endIndex)
            let range = start..<end
            return self[range]
    }
}


class Palindrome {
    func isPalindrome(n: Int) -> Bool{
        var nString = String(n)
        
        let length = countElements(nString)
        
        if length % 2 != 0 {
            return false
        }
        
        let half = length / 2
        
        let front:String = nString[0...half-1]
        let back:String = nString[half...length-1]
        
        var reverseBack = ""
        
        for character in back {
            reverseBack = String(character) + reverseBack
        }
        
        if front != reverseBack {
            return false
        }
    
        
        return true
    }
    
    func getMaxPalindromes() -> Int{
        var result = 0
        for i in reverse(100...999) {
            for j in reverse(100...999) {
                var n = i * j
                
                if n < result {
                    break
                }
                
                if n > result && isPalindrome(i * j){
                    result = n
                }
            }
        }
        
        return result
    }
}

class PalindromeTests: QuickSpec{
    override func spec(){
        var palind: Palindrome?
        
        beforeEach{
            palind = Palindrome()
        }
        
        describe("paindrome test"){
            it("isPalindrome"){
                expect(palind?.isPalindrome(99)).to(beTruthy())
                expect(palind?.isPalindrome(9009)).to(beTruthy())
                expect(palind?.isPalindrome(9999)).to(beTruthy())
                expect(palind?.isPalindrome(1991)).to(beTruthy())
                
                expect(palind?.isPalindrome(9219)).to(beFalsy())
                expect(palind?.isPalindrome(9019)).to(beFalsy())
                
                expect(palind?.isPalindrome(999)).to(beFalsy())
                expect(palind?.isPalindrome(1)).to(beFalsy())
            }
            
            it("getPalindroms"){
                expect(palind?.getMaxPalindromes()).to(equal(906609))
            }
        }
    }
}