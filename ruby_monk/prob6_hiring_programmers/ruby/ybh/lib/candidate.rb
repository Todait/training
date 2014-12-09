class Candidate
  attr_accessor :languages_worked_with, :years_of_experience, :github_points, :age, :applied_recently

  def initialize(languages_worked_with, years_of_experience, github_points, age, applied_recently)
    @languages_worked_with = languages_worked_with
    @years_of_experience = years_of_experience
    @github_points = github_points
    @age = age
    @applied_recently = applied_recently
  end

  def is_an_experienced_ruby_programmer(candidate)
    (candidate.languages_worked_with.include? 'Ruby') &&
    (candidate.years_of_experience >= 2 || candidate.github_points >= 500) &&
    !(candidate.age < 15 || candidate.applied_recently)
  end
end
