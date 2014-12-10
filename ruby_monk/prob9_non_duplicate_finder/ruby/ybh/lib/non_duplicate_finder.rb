class NonDuplicateFinder
  def non_duplicated_values(values)
    values.uniq.select { |value| 1 == values.count(value) }
    # values.find_all { |x| values.count(x) == 1 }
  end
end