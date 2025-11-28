import random as r
import math as m
long_s = [i for i in range(6, 20)]
float_x = [r.randint(-60, 110)/10 for i in range(15)]
s1 = [[0]*15]
for i in range(13):
    s1.append([0]*15)
for i in range(len(s1)):
    if long_s[i] == 17:
        for j in range(len(s1[i])):
            s1[i][j] = m.asin(2/3 * 0.2 * (float_x[j]+2.5)/17)
    elif long_s[i] in [9, 11, 12, 14, 15, 16, 18]:
        for j in range(len(s1[i])):
            s1[i][j] = (m.asin((float_x[j]+2.5)/17))**(1/3) * (1/2 - (m.tan(float_x[j]))**(1/3))
    else:
        for j in range(len(s1[i])):
            s1[i][j] = m.log(m.sin(m.e**(float_x[j]/9)) ** 2, m.e)
for i in range(len(s1)):
    print(s1[i])