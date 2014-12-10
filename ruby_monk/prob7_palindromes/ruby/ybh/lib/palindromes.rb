class Palindromes
  def palindrome?(sentence)
    sentence.downcase!.gsub!(" ", "").reverse.eql? sentence
  end
end
