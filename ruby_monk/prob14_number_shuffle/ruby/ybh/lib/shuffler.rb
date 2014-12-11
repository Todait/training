class Shuffler
  def number_shuffle(number)
    number.to_s.split("").permutation(number.to_s.length).to_a.inject([]) { |r, v| r << v.join.to_i }
  end
end