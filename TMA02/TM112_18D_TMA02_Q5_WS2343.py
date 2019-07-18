# TM112 18D TMA02 WS2343 Question 5

""" Computes number of lorries required to concrete
a floor of given dimensions """

def float_rounded_up(float):
    """Round up a float to the nearest integer"""
    integer = int(float)
    if int(float) != float: 
        integer = int(float + 1)
    return integer

def calculate_number_lorries(width, length, height, radius,l_length):
    """Compute number of lorries required by dividng floor size
    by lorry volume"""
    floor_size = width * length * height
    lorry_volume = radius * radius * 3.14159 * l_length
    number_lorries = floor_size / lorry_volume
    lorries_required = float_rounded_up(number_lorries)
    return lorries_required

# Input: Floor dimensions, positive number
floor_width = 5
floor_length = 4
floor_height = 2
# Input: Lorry dimensions, positive number
lorry_radius = 1.5
lorry_length = 3


# Sub-problem: Compute number of lorries required
lorries = calculate_number_lorries(floor_width, floor_length, floor_height,
                                  lorry_radius, lorry_length)

# Output: Lorries required, an integer
print("The number of lorries required is", lorries)

