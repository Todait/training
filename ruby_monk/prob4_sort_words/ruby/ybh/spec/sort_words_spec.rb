require 'spec_helper'
require 'sort_words'

describe "SortWords" do
	let(:sorter) { SortWords.new }

	describe "sort_string" do
		it "Given 'Awesome I am' it returns 'I am Awesome'" do
			expect(sorter.sort_string("Awesome I am")).to eq("I am Awesome")
		end
	end
end