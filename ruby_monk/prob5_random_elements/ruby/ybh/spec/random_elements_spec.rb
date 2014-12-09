require 'spec_helper'
require 'random_elements'

describe "RandomElements" do
  let(:selector) { RandomElements.new }

  describe "random_select" do
    it "Returns the number of elements requested from a 5-element array" do
      expect(selector.random_select([1,2,3,4,5], 2).length).to eq(2)
    end

    it "Returns the number of elements requested from a 4-element array" do
      expect(selector.random_select([1,2,3,4], 2).length).to eq(2)
    end

    it "Returns the number of elements requested from a 3-element array" do
      expect(selector.random_select([1,2,3], 2).length).to eq(2)
    end
  end
end