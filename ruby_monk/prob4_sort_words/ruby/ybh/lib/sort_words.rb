class SortWords
	def sort_string(string)
		string.split(" ").sort {|l,r| l.length <=> r.length}.join(" ")
	end
end