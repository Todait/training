require 'spec_helper'
require 'all_fixnum_checker'

describe "AllFixnumChecker" do
  let(:checker) { AllFixnumChecker.new }

  describe "array_of_fixnums" do
    it "returns 'true' for [1,2,3]" do
      expect(checker.array_of_fixnums?([1,2,3])).to eq(true)
    end

    it "returns 'false' for ['a',1,:b]" do
      expect(checker.array_of_fixnums?(['a',1,:b])).to eq(false)
    end

    it "returns 'true' for []" do
      expect(checker.array_of_fixnums?([])).to eq(true)
    end
  end
end