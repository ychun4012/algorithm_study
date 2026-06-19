SELECT round(avg(DAILY_FEE)) AVERAGE_FEE
from CAR_RENTAL_COMPANY_CAR
where CAR_TYPE = 'SUV';

SELECT FLAVOR
from FIRST_HALF
order by TOTAL_ORDER desc, SHIPMENT_ID;

SELECT flavor
from first_half join icecream_info using (flavor)
where total_order > 3000 and ingredient_type = 'fruit_based'
order by total_order desc;