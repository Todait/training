require 'spec_helper'
require 'candidate'

describe "HiringProgrammers" do
  let(:candidate) { Candidate.new(["C", "Ruby", "C++"], 2, 500, 15, false ) }

  describe "is_an_experienced_ruby_programmer" do
    it "a programmer who has the 3 years of experience is accepted" do
      candidate.years_of_experience = 3
      expect(candidate.is_an_experienced_ruby_programmer(candidate)).to eq(true)
    end

    it "a programmer with 600 github points is accepted" do
      candidate.years_of_experience = 1
      candidate.github_points = 600
      expect(candidate.is_an_experienced_ruby_programmer(candidate)).to eq(true)
    end

    it "programmers who do not list Ruby among languages that they've worked with are not considered" do
      candidate.languages_worked_with = ["C"]
      expect(candidate.is_an_experienced_ruby_programmer(candidate)).to eq(false)
    end

    it "a programmer who has applied recently is not considered" do
      candidate.applied_recently = true
      expect(candidate.is_an_experienced_ruby_programmer(candidate)).to eq(false)
    end

    it "programmers with neither 2 years experience nor 500 Github points are not considered" do
      candidate.years_of_experience = 1
      candidate.github_points = 400
      expect(candidate.is_an_experienced_ruby_programmer(candidate)).to eq(false)
    end

    it "smart kids are sadly not considered" do
      candidate.age = 10
      expect(candidate.is_an_experienced_ruby_programmer(candidate)).to eq(false)
    end
  end
end