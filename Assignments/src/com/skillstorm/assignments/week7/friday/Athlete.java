public class Athlete implements Comparable<Athlete> {

    private String name;
    private int wins;
    private int events;

    public Athlete(String name, int wins, int events) {
        this.name = name;
        this.wins = wins;
        this.events = events;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getEvents() {
        return events;
    }

    public void setEvents(int events) {
        this.events = events;
    }

    /**
     * Returns the athlete's win/loss ratio.
     * 
     * @return
     */
    public double getWinRatio() {
        return (double) this.getWins() / (double) this.getEvents() * 100;
    }

    /**
     * Compares two athletes using their win ratios.
     * If either athlete has only competed in 30 or less events, they are instead
     * compared
     * according to their number of events played.
     */
    @Override
    public int compareTo(Athlete rival) {
        if (this == null || rival == null) {
            throw new NullPointerException("Can't compare null athlete objects");
        }
        if (this.events <= 30 || rival.events <= 30) {
            return this.events - rival.events;
        }
        return (int) this.getWinRatio() - (int) rival.getWinRatio();
    }

    /**
     * Returns string that lists athlete's name, number of wins, number of events,
     * and win rate.
     * If they have competed in 30 or less events, win rate shows as unranked.
     */
    @Override
    public String toString() {
        if (this.events <= 30) {
            return String.format("%s: Wins: %d, Events: %d, Win Rate: *not yet ranked*", name, wins, events,
                    getWinRatio());
        }
        return String.format("%s: Wins: %d, Events: %d, Win Rate: %.2f%%", name, wins, events, getWinRatio());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + wins;
        result = prime * result + events;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Athlete other = (Athlete) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (wins != other.wins)
            return false;
        if (events != other.events)
            return false;
        return true;
    }

}
