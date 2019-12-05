"""python循环倒叙列表的5种方法"""

"""方法五：reverse()反转"""
lista = [1,2,4,5,8,19]
lista.reverse()
print(lista)

"""方法一 ：直接使用reversed方法,reversed只适用于与序列(列表、元组、字符串)"""
lista = [1,2,4,5,8,19]
for i in reversed(lista):
    print(i,end=" ")

"""方法二：从列表最后一位下角标的元素前往循环，步长为-1"""
lista = [1,2,4,5,8,19]
for i in range(len(lista)-1,-1,-1):
    print(lista[i],end=" ")

"""输出格式为列表"""
lista = [1,2,4,5,8,19]
b=[lista[i] for i in range(len(lista)-1,-1,-1)]
print(b)

"""方法三：sorted+reverse适用于序列(列表、元组、字符串)、集合、字典"""
lista = [1, 2, 4, 5, 8, 19]
lis2 = sorted(lista, reverse=True)
print(lis2)


"""方法四：切片（感觉使用起来最简单）"""
lista = [1,2,4,5,8,19]
print(lista[::-1])
