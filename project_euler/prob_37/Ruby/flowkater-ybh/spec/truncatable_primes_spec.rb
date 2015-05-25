require "truncatable_primes"
require "spec_helper"

describe "TruncatablePrimes" do
	let!(:tp){TruncatablePrimes.new}

	it "is_prime?" do
		expect(tp.is_prime?(2)).to be_truthy
		expect(tp.is_prime?(3)).to be_truthy
		expect(tp.is_prime?(5)).to be_truthy
		expect(tp.is_prime?(7)).to be_truthy
		expect(tp.is_prime?(11)).to be_truthy
		expect(tp.is_prime?(13)).to be_truthy
		expect(tp.is_prime?(17)).to be_truthy
		
		expect(tp.is_prime?(1)).to be_falsy
		expect(tp.is_prime?(4)).to be_falsy
		expect(tp.is_prime?(6)).to be_falsy
		expect(tp.is_prime?(8)).to be_falsy
		expect(tp.is_prime?(9)).to be_falsy
		expect(tp.is_prime?(10)).to be_falsy
		expect(tp.is_prime?(12)).to be_falsy
	end

	it "left_digit_prime?" do
		expect(tp.left_digit_prime?(232)).to be_truthy
		expect(tp.left_digit_prime?(434)).to be_falsy
		expect(tp.left_digit_prime?(732)).to be_truthy
		expect(tp.left_digit_prime?(634)).to be_falsy
	end

	it "right_digit_prime?" do
		expect(tp.right_digit_prime?(232)).to be_truthy
		expect(tp.right_digit_prime?(434)).to be_falsy
		expect(tp.right_digit_prime?(733)).to be_truthy
		expect(tp.right_digit_prime?(66)).to be_falsy
	end

	it "left_remove" do
		expect(tp.left_remove(3797)).to eq([797, 97])
		expect(tp.left_remove(37979)).to eq([7979, 979,79])
		expect(tp.left_remove(3797989)).to eq([797989, 97989, 7989, 989, 89])
	end

	it "right_remove"do
		expect(tp.right_remove(3797)).to eq([379, 37])
		expect(tp.right_remove(37979)).to eq([3797, 379, 37])
		expect(tp.right_remove(3797989)).to eq([379798, 37979, 3797, 379, 37])
	end

	it "array_prime_check" do
		expect(tp.array_prime_check([797, 97])).to be_truthy 
		expect(tp.array_prime_check([797, 97, 22])).to be_falsy
	end

	it "truncatable_prime?" do
		expect(tp.truncatable_prime?(3797)).to be_truthy
		expect(tp.truncatable_prime?(23)).to be_truthy
		expect(tp.truncatable_prime?(3798)).to be_falsy
		expect(tp.truncatable_prime?(2333)).to be_falsy
	end

	it "truncatable_primes" do
		expect(tp.truncatable_primes).to eq([23, 37, 53, 73, 313, 317, 373, 797, 3137, 3797, 739397])
	end
end