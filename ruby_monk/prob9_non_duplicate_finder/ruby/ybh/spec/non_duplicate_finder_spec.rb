require 'spec_helper'
require 'non_duplicate_finder'

describe "NonDuplicateFinder" do
  describe "non_duplicated_values" do
    let(:finder) { NonDuplicateFinder.new }

    it "returns [1,4,5], given [1,2,2,3,3,4,5]" do
      expect(finder.non_duplicated_values([1,2,2,3,3,4,5])).to match_array([1,4,5])
    end

    it "returns [1,3], given [1,2,2,3,4,4]" do
      expect(finder.non_duplicated_values([1,2,2,3,4,4])).to match_array([1,3])
    end
  end
end