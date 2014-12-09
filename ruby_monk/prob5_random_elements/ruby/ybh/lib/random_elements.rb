class RandomElements
  def random_select(array, n)
  selected_array = [];
  
  n.times do
    selected_array.push(array[rand(array.length)])
  end
  
  return selected_array
  end
end