# act 4.9
def list_length(a_list):
    length = 0
    for item in a_list:
        length = length + 1
    return length

test_list = ['a','b','c','d','e']

length_test_list = list_length(test_list)

print('The list', test_list, 'contains', length_test_list, 'items.')
      
