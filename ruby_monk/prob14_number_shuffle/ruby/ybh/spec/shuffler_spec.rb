require 'spec_helper'
require 'shuffler'

describe "Shuffler" do
  let(:shuffler) { Shuffler.new }

  describe "number_shuffle" do
    it "returns [123, 132, 213, 231, 312, 321] for 123" do
      expect_array = [123, 132, 213, 231, 312, 321]
      expect(shuffler.number_shuffle(123)).to match_array(expect_array)
    end

    it "returns [1234, 1243, 1324, 1342, 1423, 1432, 2134, 2143, 2314, 2341, 2413, 2431, 3124, 3142, 3214, 3241, 3412, 3421, 4123, 4132, 4213, 4231, 4312, 4321] for 1234" do
      expect_array = [1234, 1243, 1324, 1342, 1423, 1432, 2134, 2143, 2314, 2341, 2413, 2431, 3124, 3142, 3214, 3241, 3412, 3421, 4123, 4132, 4213, 4231, 4312, 4321]
      expect(shuffler.number_shuffle(1234)).to match_array(expect_array)
    end
  end
end