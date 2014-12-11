require 'spec_helper'
require 'color'

describe "Color" do
  describe "initialize" do
    it "initializes the color with the RGB values" do
      color = Color.new(0, 0, 0)
      expect(color.r).to eq(0)
      expect(color.g).to eq(0)
      expect(color.b).to eq(0)
    end
  end

  describe "brightness_index" do
    it "returns the correct brightness index for (42, 21, 58)" do
      color = Color.new(42, 21, 58)
      expect(color.brightness_index).to eq(31)
    end

    it "returns the correct brightness index for (100, 200, 255)" do
      color = Color.new(100, 200, 255)
      expect(color.brightness_index).to eq(176)
    end
  end

  # ruby monk 테스트 통과하는 것으로 대체함
  # describe "brightness_difference" do
  #   it "returns the correct brighness difference between 2 colors" do
  #   end
  # end

  # ruby monk 테스트 통과하는 것으로 대체함
  # describe "hue_difference" do
  #   it "returns the correct hue difference between 2 colors" do
  #   end
  # end

  describe "enough_contrast?" do
    it "tells that there is is not enough contrast between (42, 21, 58) and (240, 41, 25)" do
      color1 = Color.new(42, 21, 58)
      color2 = Color.new(240, 41, 25)
      expect(color1.enough_contrast?(color2)).to eq(false)
    end

    it "tells that there is is enough contrast between (42, 42, 42) and (210, 210, 210)" do
      color1 = Color.new(42, 42, 42)
      color2 = Color.new(210, 210, 210)
      expect(color1.enough_contrast?(color2)).to eq(true)
    end
  end
end