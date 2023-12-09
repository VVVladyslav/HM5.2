public class Recurs {

    public static int findNumber(int nNumberToSearch) {
        if (nNumberToSearch <= 1) {
            return nNumberToSearch;
        }
        return findNumber(nNumberToSearch - 1) + findNumber(nNumberToSearch - 2);
    }
}

