/** @jsx React.DOM */

var MyDate = React.createClass({
    getInitialState: function () {
        return {x: 0};
    },

    render: function () {
        return <div className="row">
                  <div className="col-md-offset-4 col-md-1">
                     <h1><span className="label label-primary">00</span></h1>
                  </div>

                  <div className="col-md-1">
                     <h1><span className="label label-primary">00</span></h1>
                  </div>

                  <div className="col-md-1">
                     <h1><span className="label label-primary">00</span></h1>
                  </div>
               </div>;
    }
});

React.renderComponent(
    <MyDate />,
    document.getElementById('container')
);
