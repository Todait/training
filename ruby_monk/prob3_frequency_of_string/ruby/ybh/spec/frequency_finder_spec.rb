require 'spec_helper'
require 'frequency_finder'

describe "FrequencyFinder" do
	let(:finder) { FrequencyFinder.new }

	describe "find_frequency" do
		it "'Do or do not... there is no try.' has two 'do's" do
			sentence = 'Do or do not... there is no try.'
			word = 'do'
			expect(finder.find_frequency(sentence, word)).to eq(2)
		end

		it "'Judge me by size, do you?' does not have 'Yoda'" do
			sentence = 'Judge me by size, do you?'
			word = 'Yoda'
			expect(finder.find_frequency(sentence, word)).to eq(0)
		end

		it "'Named must your fear be before banish it you can.' has one 'fear'" do
			sentence = 'Named must your fear be before banish it you can.'
			word = 'fear'
			expect(finder.find_frequency(sentence, word)).to eq(1)
		end

		it "Frequency of the word 'hello' in the sentence 'hello' should be 1" do
			sentence = 'hello'
			word = 'hello'
			expect(finder.find_frequency(sentence, word)).to eq(1)
		end
	end
end