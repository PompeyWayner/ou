# Compute the range of toy sales

# Input: a list of toy sales, positive integers
toy_sales = [7, 6, 0, 10] # Maximum possible range

# Sub-problem: find the lowest and highest sales
lowest = toy_sales[0]
highest = toy_sales[0]
for sales in range(1, len(toy_sales)):
    if toy_sales[sales] < lowest:
        lowest = toy_sales[sales]
    elif toy_sales[sales] > highest:
        highest = toy_sales[sales]

# Sub-problem: compute the range of highest and lowest sales
range = highest - lowest

# Output: range, integer, maybe zero
print("The range of the toy sales is",highest, "-", lowest, "=", range)

