class LengthFinder
	def length_finder(input_array)
	  length_array = Array.new
	  input_array.each do |string|
	    length_array.push string.length
	  end
	  return length_array
	end
end
