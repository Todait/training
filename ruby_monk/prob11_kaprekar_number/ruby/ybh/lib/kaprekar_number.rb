class KaprekarNumber
  def kaprekar?(k)
    mul = (k**2).to_s
    left = mul[0..-(k.to_s.length+1)].to_i
    right = mul[-k.to_s.length..-1].to_i
    k == (left + right)

    # no_of_digits = k.to_s.size
    # square = (k ** 2).to_s
  
    # second_half = square[-no_of_digits..-1]
    # first_half = square.size.even? ? square[0..no_of_digits-1] : square[0..no_of_digits-2]
  
    # k == first_half.to_i + second_half.to_i
  end
end
