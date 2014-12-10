class CubesComputer
  def sum_of_cubes(a, b)
    (a..b).inject(0) { |sum, v| sum + v**3 }
  end
end
