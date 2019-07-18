# Act 2.24

def fahrenheit(celsius):
    """ Convert tempature celsius into farenheit """    
    return ((9 * celsius) / 5) + 32
    
def fahrenheit_list(celsius_lst):
    """ Convert list of temperature in celsius to fahrenheit"""
    f_list = []
    
    for celcius_temp in celsius_lst:
        fahrenheit_temp = fahrenheit(celcius_temp)
        f_list = f_list + [fahrenheit_temp]
    return f_list
# uncomment below to get output vis program rather than using the shell to test
#temperatures_celsius = [20, 18, 22, 33]

#print(fahrenheit_list(temperatures_celsius))


