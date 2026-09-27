class Solution:
    def equalPairs(self, grid: list[list[int]]) -> int:
        n= len(grid)

        rows={}

        for row in grid:
            key=tuple(row)
            rows[key]=rows.get(key,0)+1

        count=0

        for i in range(n):
            col=[]
            for j in range(n):
                col.append(grid[j][i])

            key = tuple(col)

            if key in rows:
                count+=rows[key]

        return count