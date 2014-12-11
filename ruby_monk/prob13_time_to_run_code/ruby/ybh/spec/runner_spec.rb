require 'spec_helper'
require 'runner'

describe "Runner" do
  let(:runner) { Runner.new }

  describe "exec_time" do
    it "division takes more time than addition" do
      division = lambda { 332.0 / 32 }
      addition = lambda { 332.0 + 32 }
      expect(runner.exec_time(division) > runner.exec_time(addition)).to eq(true)
    end
  end
end