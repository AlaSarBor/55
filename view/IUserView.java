package 5.view;

import 5.model.user;

import java.util.List;

public interface IUsersView<T extends User>{
    public void PrintOnConsole(T user);
    public void PrintOnConsoleArr(List<T> users);
}