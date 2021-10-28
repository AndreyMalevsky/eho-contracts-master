/* create a schema for contracts */
CREATE TABLE contracts.contracts(
id BIGSERIAL PRIMARY KEY,

seller_id BIGINT NOT NULL REFERENCES profiles.company(id),
buyer_id BIGINT NOT NULL REFERENCES profiles.company(id),
contract_owner_id BIGINT NOT NULL REFERENCES profiles.company(id),

);

