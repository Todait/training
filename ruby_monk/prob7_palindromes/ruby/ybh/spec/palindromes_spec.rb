require 'spec_helper'
require 'palindromes'

describe "Palindromes" do
  let(:palindromes) { Palindromes.new }

  describe "palindrome?" do
    it "returns true for 'Race fast safe car'" do
      expect(palindromes.palindrome?('Race fast safe car')).to eq(true)
    end

    it "returns true for 'Live not on Evil'" do
      expect(palindromes.palindrome?('Live not on Evil')).to eq(true)
    end

    it "returns false for 'Yreka Bakey'" do
      expect(palindromes.palindrome?('Yreka Bakey')).to eq(false)
    end
  end
end