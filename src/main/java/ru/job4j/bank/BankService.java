package ru.job4j.bank;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 3. Банковские переводы.[#257526]
 */
public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        List<Account> accounts = users.get(findByPassport(passport));
        if (accounts != null && !accounts.contains(account)) {
            accounts.add(account);
        }
    }

    public User findByPassport(String passport) {
        return users.keySet().stream()
                .filter(user -> user.getPassport().equals(passport))
                .findAny().orElse(null);
    }

    public Account findByRequisite(String passport, String requisite) {
        if (users.get(findByPassport(passport)) == null) {
            return null;
        }
        return users.get(findByPassport(passport)).stream()
                .filter(acc -> acc.getRequisite().equals(requisite))
                .findAny().orElse(null);
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        if (findByRequisite(srcPassport, srcRequisite) == null
                && findByRequisite(destPassport, destRequisite) == null
                && findByRequisite(srcPassport, destRequisite).getBalance() < amount) {
            return false;
        }
        Account srcAcc = findByRequisite(srcPassport, srcRequisite);
        Account destAcc = findByRequisite(destPassport, destRequisite);
        srcAcc.setBalance(srcAcc.getBalance() - amount);
        destAcc.setBalance(destAcc.getBalance() + amount);
        return true;
    }
}
