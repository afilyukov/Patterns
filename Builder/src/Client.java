public class Client {

    private int clientId;
    private String clientName;
    private String departName;
    private int credit;
    private int mngrClientId;

    public Client(ClientBuilder clientBuilder) {
        if (clientBuilder == null) {
            throw new IllegalArgumentException("Please provide employee builder to build employee object.");
        }
        if (clientBuilder.clientId <= 0) {
            throw new IllegalArgumentException("Please provide valid client number.");
        }
        if (clientBuilder.clientName == null || clientBuilder.clientName.trim().isEmpty()) {
            throw new IllegalArgumentException("Please provide client name.");
        }
        this.clientId = clientBuilder.clientId;
        this.clientName = clientBuilder.clientName;
        this.departName = clientBuilder.departName;
        this.credit = clientBuilder.credit;
        this.mngrClientId = clientBuilder.mngrClientId;
    }

    public int getClientId() {
        return this.clientId;
    }

    public String getClientName() {
        return this.clientName;
    }

    public String getDepartName() {
        return this.departName;
    }

    public int getCredit() {
        return this.credit;
    }

    public int getMngrClientId() {
        return this.mngrClientId;
    }

    public static class ClientBuilder {
        private int clientId;
        protected String clientName;
        protected String departName;
        protected int credit;
        protected int mngrClientId;

        public ClientBuilder() {
            super();
        }

        public ClientBuilder clientId(int clientId) {
            this.clientId = clientId;
            return this;
        }

        public ClientBuilder clientName(String clientName) {
            this.clientName = clientName;
            return this;
        }

        public ClientBuilder departName(String departName) {
            this.departName = departName;
            return this;
        }

        public ClientBuilder credit(int credit) {
            this.credit = credit;
            return this;
        }

        public ClientBuilder mngrClientId(int mngrClientId) {
            this.mngrClientId = mngrClientId;
            return this;
        }

        public Client build() {
            if (!(clientId > 0 && clientName != null && !clientName.trim().isEmpty())) {
                System.out.println("Client objects can not be build without required details");
            }
            return new Client(this);
        }
    }

    @Override
    public String toString() {
        // StringBuilder тоже builder?
        StringBuilder builder = new StringBuilder();
        builder.append("Client [clientId=").append(clientId).append(", name=").append(clientName).append(", DepartamentName=")
                .append(departName).append(", credit=").append(credit).append(",  client manager=").append(mngrClientId)
                .append("]");
        return builder.toString();
    }
}