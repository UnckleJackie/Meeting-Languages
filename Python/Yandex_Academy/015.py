n = int(input())  # hours
m = int(input())  # minutes
t = int(input())  # delivery

time_hours_digit2 = ((n + (t + m) // 60) % 24) // 10
time_hours_digit1 = ((n + (t + m) // 60) % 24) % 10
time_minutes_digit2 = ((m + t) % 60) // 10
time_minutes_digit1 = ((m + t) % 60) % 10

print(str(time_hours_digit2) + str(time_hours_digit1) + 
      ":" + str(time_minutes_digit2) + str(time_minutes_digit1))