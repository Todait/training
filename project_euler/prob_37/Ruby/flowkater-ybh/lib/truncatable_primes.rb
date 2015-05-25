class TruncatablePrimes
	def is_prime?(n)
		return false if 1 == n
		(2..Math.sqrt(n)).each {|i| return false if 0 == n % i} 
		true
	end

	def left_digit_prime?(n)
		is_prime?(n.to_s[0].to_i)
	end

	def right_digit_prime?(n)
		is_prime?(n.to_s[-1].to_i)
	end

	def left_remove(n)
		(2...n.to_s.length).reverse_each.inject([]) { |result, i|  result << n % 10**i }
	end

	def right_remove(n)
		(1...n.to_s.length-1).inject([]) { |result, i| result << n / 10**i }
	end

	def array_prime_check(arr)
		arr.each {|n| return false unless is_prime?(n)} 
		true
	end

	def truncatable_prime?(n)
		if is_prime?(n) && left_digit_prime?(n) && right_digit_prime?(n)
			return true if array_prime_check(left_remove(n)) && array_prime_check(right_remove(n))
		end
		false
	end

	## Optimization
	def truncatable_primes
		result = []
		i = 23
		loop do
			result << i if truncatable_prime?(i)
			break if result.length == 11
			i += 2
		end
		result
	end
end