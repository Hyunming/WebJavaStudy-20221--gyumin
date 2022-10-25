for k in range(0,8) :
    for h in range(0,k) :
        print("*",end='')
    print("")
for i in range(0 , 3) :
    for j in range(0, i+1) :
        print(' ',end = '')
    for j in range(2 * i,5) :
        print('*',end='')
    print('')
print("========================")
for i in range(0 , 8) :
    for j in range(0,-i+7) :
        print(' ',end = '')
    for j in range(0,i) :
        print('*',end='')
    print('')
for i in range(0 , 3) :
    for j in range(0, i+1) :
        print(' ',end = '')
    for j in range(2 * i,5) :
        print('*',end='')
    print('')
print("=========================")
for i in range(1 , 4) :
    for j in range(4-i) :
        print(' ',end = '')
    for j in range(2*i-1) :
        print('*',end='')
    print('')
for i in range(0 , 8) :
    for j in range(0,-i+7) :
        print('*',end = '')
    for j in range(0,i) :
        print(' ',end='')
    print('')
print("=======================")
for i in range(1 , 4) :
    for j in range(4-i) :
        print(' ',end = '')
    for j in range(2*i-1) :
        print('*',end='')
    print('')
for i in range(0 , 8) :
    for j in range(0,i) :
        print(' ',end='')
    for j in range(0,-i+7) :
        print('*',end = '')
    print('')

