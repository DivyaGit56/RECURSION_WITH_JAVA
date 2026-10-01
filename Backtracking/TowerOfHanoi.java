public int towerOfHanoi(int n, int from, int to, int aux) {

    // BASE CASE
    if(n == 1) return 1;

    int moves = 0;

    // 1️⃣ CHOOSE + EXPLORE
    moves += towerOfHanoi(n-1, from, aux, to);

    // 2️⃣ DO THE CURRENT MOVE
    moves++;

    // 3️⃣ EXPLORE SECOND PART
    moves += towerOfHanoi(n-1, aux, to, from);

    return moves;
}
