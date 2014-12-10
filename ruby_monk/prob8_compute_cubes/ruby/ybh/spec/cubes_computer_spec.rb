require 'spec_helper'
require 'cubes_computer'

describe "CubesComputer" do
  let(:computer) { CubesComputer.new }

  describe "sum_of_cubes" do
    it "returns 216 for range 3 to 5" do
      expect(computer.sum_of_cubes(3, 5)).to eq(216)
    end

    it "returns 36 for range 1 to 3" do
      expect(computer.sum_of_cubes(1, 3)).to eq(36)
    end
  end
end