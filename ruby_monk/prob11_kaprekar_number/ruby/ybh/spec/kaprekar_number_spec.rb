require 'spec_helper'
require 'kaprekar_number'

describe "KaprekarNumber" do
  let(:kaprekar) { KaprekarNumber.new }

  describe "kaprekar?" do

    it "returns true for 9" do
      expect(kaprekar.kaprekar?(9)).to eq(true)
    end

    it "returns false for 46" do
      expect(kaprekar.kaprekar?(46)).to eq(false)
    end

    it "returns true for 55" do
      expect(kaprekar.kaprekar?(55)).to eq(true)
    end

    it "returns false for 90" do
      expect(kaprekar.kaprekar?(90)).to eq(false)
    end

    it "returns true for 297" do
      expect(kaprekar.kaprekar?(297)).to eq(true)
    end

    it "returns true for 703" do
      expect(kaprekar.kaprekar?(703)).to eq(true)
    end
  end
end