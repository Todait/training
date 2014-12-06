require 'spec_helper'
require 'length_finder'

describe "LengthFinder" do
	let(:finder){LengthFinder.new}

	describe "length_finder" do
		it "given ['I','am','genius'] it returns [1,2,6]" do
			expect(finder.length_finder(['I','am','genius'])).to match_array([1,2,6])
		end

		it "given ['things','are','','awesome'] it returns [6,3,0,7]" do
			expect(finder.length_finder(['things','are','','awesome'])).to match_array([6,3,0,7])
		end
	end

end