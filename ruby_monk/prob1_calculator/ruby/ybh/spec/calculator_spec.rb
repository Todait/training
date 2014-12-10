require 'spec_helper'
require 'calculator'

describe "Caculator" do 
	let(:cal){Calculator.new}

	describe "add" do
		it "adding 2 and 3 gives 5" do
			expect(cal.add(2, 3)).to eq(5)
		end

		it "adding 4 and -4 gives 0" do
			expect(cal.add(4, -4)).to eq(0)
		end
	end

	describe "subtract" do
		it "Subtracting 2 from 5 gives 3" do
			expect(cal.subtract(5, 2)).to eq(3)
		end
	end
end