// Last updated: 12/08/2026, 11:55:53
const dfs = _.memoize(i => {
    if (!i) return 0;
    for (let j = 1; (j ** 2) <= i; j++)
        if (!dfs(i - j ** 2))
            return 1;

    return 0;
});

const winnerSquareGame = n => dfs(n);