if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    lst = [x for x in arr]
    lst1 = list(set(lst))
    lst1.sort()
    print(lst1[-2])