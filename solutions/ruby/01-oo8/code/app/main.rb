def main
  $stdout.write("$ ")

  # Wait for user input
  command, *args = gets.chomp.split(" ")
end

main
