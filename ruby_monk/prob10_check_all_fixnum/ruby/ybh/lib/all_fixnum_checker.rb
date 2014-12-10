class AllFixnumChecker
  def array_of_fixnums?(array)
    array.inject(true) { |mem, var| mem && var.is_a?(Fixnum) }
    # array.all? { |x| x.is_a? Fixnum }
  end
end