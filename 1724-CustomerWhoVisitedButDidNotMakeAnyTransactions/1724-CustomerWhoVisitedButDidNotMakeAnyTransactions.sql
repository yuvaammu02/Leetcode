-- Last updated: 12/08/2026, 11:55:35
select customer_id , count(visit_id) as count_no_trans from Visits
where 
visit_id not in (select  visit_id from Transactions)
group by customer_id;