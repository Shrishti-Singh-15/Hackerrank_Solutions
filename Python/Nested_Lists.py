if __name__ == '__main__':
    names = []
    scores = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        names.append(name)
        scores.append(score)
    second_lowest = sorted(set(scores))[1]
    for i in sorted(zip(names, scores)):
        [name, score] = i
        if score == second_lowest:
            print(name)