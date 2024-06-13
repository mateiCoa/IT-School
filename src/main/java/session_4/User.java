package session_4;

import java.util.Objects;

public class User {


        String firstName;

        public User(String firstName) {
            this.firstName = firstName;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return Objects.equals(firstName, user.firstName);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(firstName);
        }
}
