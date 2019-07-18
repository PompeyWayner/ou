# List filtering program

# Input: temperatures in celcius
temperature_list = [26,34,10,18,29,30,31]
# Output: temperatures over 30 celsius
hot_days = []

for value in temperature_list:
    if value > 30:
        hot_days = hot_days + [value]

print("Hot days are", hot_days)
